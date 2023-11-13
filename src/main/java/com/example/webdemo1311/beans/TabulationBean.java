package com.example.webdemo1311.beans;

import com.example.webdemo1311.logic.Main;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@SessionScoped
@Getter
@Setter
public class TabulationBean implements Serializable {

    private Main main = new Main();

    public String tabulation() {
        if (main.getStart() > main.getEnd() || main.getStep() <= 0) {
            return "index";
        }
        return "tabulation";
    }
}
