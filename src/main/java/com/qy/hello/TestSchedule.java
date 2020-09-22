package com.qy.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@Slf4j
public class TestSchedule {

  @Scheduled(fixedDelay = 10*1000)
  public void test(){
//    System.out.println("定时任务执行开始!");
//    System.out.println("定时任务执行结束!");
    log.info("定时任务开始");
    log.info("定时任务结束");
  }
}

