package com.ibolya.gyakorlas;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
   private int v = 0;

    public void increase() {
        v++;
    }

    public void decrease() {
        v--;
    }

    public int read() {
       return v;
    }
}
