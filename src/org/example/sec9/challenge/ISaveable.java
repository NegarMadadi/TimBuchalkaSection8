package org.example.sec9.challenge;

import java.util.List;
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}

