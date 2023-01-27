package com.example.learning.service;


import com.example.learning.model.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
//This annotation represents that this is a business service
//Creates instance and registers in its memory and injects wherever needed
public class TopicService {
//This is initialized only once only one copy is made
    private List<Topics> topics =  new ArrayList<>(Arrays.asList(
            new Topics(101,"Spring Framework","Spring Framework Description"),
            new Topics(102,"Core Java","Core Java Description")
        ));


    public List<Topics> getAllTopics(){
        return topics;
    }



    public List<Topics> getTopic(int id){
       int receivedId = id;
       Topics receivedTopic = null;
       List<Topics> receivedTopicList = new ArrayList<>();

       for (int i=0;i<topics.size();i++){
           if (topics.get(i).getId()==receivedId){
               receivedTopic = topics.get(i);

           }


       }
       receivedTopicList.add(receivedTopic);
       return receivedTopicList;
       //return topics.stream().filter(t -> t.getId() == receivedId).findFirst().get();

    }


    public void addTopic(Topics topic) {
        topics.add(topic);
    }

    public List<Topics> updateTopic(int id, Topics topic) {
        for (int i =0;i< topics.size();i++){
            if (topics.get(i).getId() == id){
                topics.set(i,topic);
            }
        }
        return topics;
    }

    public List<Topics> deleteTopic(int id) {
        for (int i=0;i< topics.size();i++){
            if (topics.get(i).getId()==id){
                topics.remove(i);
            }
        }
        return topics;
    }
}
