package com.iEngg.kafka.controller;

import com.iEngg.kafka.model.MatchSummary;
import com.iEngg.kafka.producer.SpringAvroProducer;
import com.iEngg.kafka.schemas.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SpringAvroRestController {

    @Autowired
    private SpringAvroProducer springAvroProducer;

    @PostMapping(value = "/matchSummary")
    public void matchSummary(@RequestBody MatchSummary summary) {
        com.iEngg.kafka.schemas.MatchSummary schema = new com.iEngg.kafka.schemas.MatchSummary();
        schema.setLocation(summary.getLocation());
        schema.setMatchDate(summary.getMatchDate());
        schema.setResult(summary.getResult());
        schema.setStadium(summary.getStadium());
        schema.setMatchNum(summary.getMatchNum());
        schema.setWinner(summary.getWinner());
        schema.setTeam1(summary.getTeam1());
        schema.setTeam2(summary.getTeam2());

        List<Score> scoreList = new ArrayList<>();
        for (com.iEngg.kafka.model.Score score : summary.getTeam1Scores()) {
            Score score1 = new Score();
            score1.setPlayerName((CharSequence) score.getPlayerName());
            score1.setBallsPlayed(score.getBallsPlayed());
            score1.setRun(score.getRun());
            scoreList.add(score1);
        }
        schema.setTeam1Scores(scoreList);

        scoreList = new ArrayList<>();
        for (com.iEngg.kafka.model.Score score : summary.getTeam2Scores()) {
            Score score2 = new Score();
            score2.setPlayerName(score.getPlayerName());
            score2.setBallsPlayed(score.getBallsPlayed());
            score2.setRun(score.getRun());
            scoreList.add(score2);
        }
        schema.setTeam2Scores(scoreList);


        springAvroProducer.send(schema);
    }
}
