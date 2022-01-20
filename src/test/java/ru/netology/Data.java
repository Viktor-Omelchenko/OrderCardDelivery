package ru.netology;

import lombok.Value;

 class DataGenerator {
    private static String date;
    private static String city;
    private static String name;
    private static String phone;
    private static String user;

    private DataGenerator() {
    }

    public static String generateDate(int shift) {
       return date;
    }

    public static String generateCity(String locale) {
        return city;
    }

    public static String generateName(String locale) {
        return name;
    }

    public static String generatePhone(String locale) {
        return phone;
    }

    public static class Registration {
        private Registration() {
        }

        public static String generateUser(String locale) {
         return user;
        }
    }

}