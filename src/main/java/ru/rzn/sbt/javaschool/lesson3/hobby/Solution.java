package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     *
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {


        DetectionResult dr = new DetectionResult();
        if(students == null) return dr;

        int rstarCount = 0,
            bikerCount = 0,
            studentCount = 0;

        for (Object s: students) {
             if (s == null) continue;
             if(s instanceof Rockstar){
                 rstarCount++;
             } else if(s  instanceof Biker){
                 bikerCount++;
             } else {
                 studentCount++;
             }
        }
        dr.setPureStudentsCount(studentCount);
        dr.setRockstarsCount(rstarCount);
        dr.setBikersCount(bikerCount);
        return dr;
    }
}
