package org.example;

import org.example.workshop.Tool;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public void run() {
        Tool tool1 = new Tool("mlotek");
        tool1.useTool();

        Tool tool2 = new Tool("srubokret");

        List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);

        for (Tool tool : tools) {
            System.out.println("Narzedzie: " + tool);
        }
    }

}
