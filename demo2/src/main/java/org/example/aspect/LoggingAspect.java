package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.Date;

/**
 * 日志记录切面
 * 使用XML配置方式实现AOP
 */
public class LoggingAspect {

    /**
     * 前置通知：在方法执行前记录日志
     * @param joinPoint 连接点
     */
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("==========前置通知==========");
        System.out.println("时间: " + new Date());
        System.out.println("方法: " + joinPoint.getSignature().getName());
        System.out.println("参数: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("==========================");
    }

    /**
     * 后置通知：在方法执行后记录日志
     * @param joinPoint 连接点
     */
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("==========后置通知==========");
        System.out.println("时间: " + new Date());
        System.out.println("方法: " + joinPoint.getSignature().getName() + " 执行完毕");
        System.out.println("==========================");
    }

    /**
     * 环绕通知：记录方法执行时间
     * @param proceedingJoinPoint 进行中的连接点
     * @return 原方法的返回值
     * @throws Throwable 可能抛出的异常
     */
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        Object result = proceedingJoinPoint.proceed();
        
        long endTime = System.currentTimeMillis();
        System.out.println("==========环绕通知==========");
        System.out.println("方法: " + proceedingJoinPoint.getSignature().getName() + 
                " 执行时间: " + (endTime - startTime) + "ms");
        System.out.println("==========================");
        
        return result;
    }
} 