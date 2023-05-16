package Homework03;

import java.util.HashMap;

public class ParsData {

    public HashMap<String, Object> parsInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    dataMap.put("sex", i);
                } else{
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexException(i);
                    }
                }
            } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = i.split("\\.");
                boolean flag = false;
                int day = Integer.parseInt(arrayDate[0]);
                int mounth = Integer.parseInt(arrayDate[1]);
                int year = Integer.parseInt(arrayDate[2]);
                if (day < 0 || day > 31 || mounth < 0 || mounth > 12 || year < 0 || year > 2023) {
                    try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(i);
                    }
                } else {
                    if (year % 4 == 0) {
                        if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 9 || mounth == 10 || mounth == 12) {
                            if (day < 32) {
                                flag = true;                
                            }
                        } else if (mounth == 2) {
                            if (day < 30) {
                                flag = true;
                            }
                        } else if (mounth == 4 || mounth == 6 || mounth == 8 || mounth == 11) {
                            if (day < 31) {
                                flag = true;
                            }
                        }
                    } else {
                        if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 9 || mounth == 10 || mounth == 12) {
                            if (day < 32) {
                                flag = true;
                            }
                        } else if (mounth == 2) {
                            if (day < 29) {
                                flag = true;
                            }
                        } else if (mounth == 4 || mounth == 6 || mounth == 8 || mounth == 11) {
                            if (day < 31) {
                                flag = true;
                            }
                        }

                    }
                    if (flag) {
                        dataMap.put("date", i);
                    } else try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(i);
                    }
                }

            } else if (i.matches("[0-9]+")) {
                dataMap.put("tel", i);
            } else if (i.matches("[A-Za-zа-яА-Я]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataMap.put("firstName", fullName[1]);
            dataMap.put("lastName", fullName[0]);
            dataMap.put("patronymic", fullName[2]);
        }
        return dataMap;
    }
}