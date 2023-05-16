package Homework03;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(data.get("lastName") + " ");
        sb.append(data.get("firstName")  + " ");
        sb.append(data.get("patronymic")  + " ");
        sb.append(data.get("date") + " ");
        sb.append(data.get("tel") + " ");
        sb.append(data.get("sex"));
       
        String filePath = data.get("lastName") + ".txt";
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}