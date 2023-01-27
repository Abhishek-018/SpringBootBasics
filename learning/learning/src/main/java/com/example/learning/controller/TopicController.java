package com.example.learning.controller;

import com.example.learning.model.Topics;
import com.example.learning.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/integers")
    public ArrayList<Integer> getAllIntegers()
    {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        return integerArrayList;
    }

    @RequestMapping("/mytopics")
    public ArrayList<Topics> getTopics(){
        ArrayList<Topics> topicbundle = new ArrayList<Topics>();
        //Creating object
        Topics obj1 = new Topics(1001,"Python","Python Description");
        Topics obj2 = new Topics(1002,"Java","Java Description");
        Topics obj3 = new Topics(1003,"C","C Description");
        //Adding object to ArrayList
        topicbundle.add(obj1);
        topicbundle.add(obj2);
        topicbundle.add(obj3);
        return topicbundle;
    }

    @Autowired
    private TopicService topicService;
    //TopicService topicService1 = new TopicService();


    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public List<Topics> getTopic(@PathVariable int id){


        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic( @RequestBody Topics topic){

        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public List<Topics> updateTopic(@PathVariable int id,@RequestBody Topics topic){
        return topicService.updateTopic(id,topic);

    }

    @DeleteMapping("/topics/{id}")
    public List<Topics> deleteTopic(@PathVariable  int id){
        return topicService.deleteTopic(id);
    }
}
