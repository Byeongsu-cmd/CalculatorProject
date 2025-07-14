package org.example.Lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculate<T> {
    private List<T> resultList=new ArrayList<>();
    public void addResult(T result){
        resultList.add(result);
    }
    public List<T> getResultList(){
        return resultList;
    }
}