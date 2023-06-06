package com.circus.controllers;

import com.circus.controllers.Main.Main;
import com.circus.models.Sessions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class FinanceCont extends Main {

    @GetMapping("/stats")
    public String sales(Model model) {
        List<Sessions> sessions = getUser().getSessions();

        model.addAttribute("income", sessions.stream().reduce(0, (i, s) -> i + s.getIncome().getIncome(), Integer::sum));
        model.addAttribute("sessions", sessions);
        model.addAttribute("role", getRole());

        sessions.sort(Comparator.comparing(Sessions::getCount));
        Collections.reverse(sessions);

        String[] topName = new String[5];
        int[] topNum = new int[5];

        for (int i = 0; i < sessions.size(); i++) {
            if (i == 5) break;
            topName[i] = sessions.get(i).getName();
            topNum[i] = sessions.get(i).getIncome().getIncome();
        }
        model.addAttribute("topName", topName);
        model.addAttribute("topNum", topNum);

        return "stats";
    }
}
