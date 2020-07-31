package com.itheima_01;

public class Teacher {

    public void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
//           throw new ScoreException();
            throw new ScoreException("分数异常，必须在0--100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}
