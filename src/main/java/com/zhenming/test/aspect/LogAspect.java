package com.zhenming.test.aspect;

import com.zhenming.test.dao.LogMapper;
import com.zhenming.test.entity.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
  @Autowired
  private LogMapper logMapper;

  @Pointcut("@annotation(com.zhenming.test.aspect.annotation.Log)")
  public void pointCut() {
  }

  @Before("pointCut()")
  public void before(JoinPoint joinPoint) throws Throwable {
    Log logBo = new Log();
    logBo.setOperation(joinPoint.getTarget().getClass().getName());
    logMapper.insertSelective(logBo);
  }
}
