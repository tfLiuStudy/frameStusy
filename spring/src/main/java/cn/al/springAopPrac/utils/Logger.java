package cn.al.springAopPrac.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * logger
 */
@Component("logger")
@Aspect
public class Logger {

    /**
     * 用于打印日志
     * 计划让其在切入点方法执行之前执行
     */
    @Before("execution(* cn.al.springAopPrac.service.impl.*.*(..))")
    public void printLog() {
        System.out.println("Logger 类中的 printLog 方法开始记录日志了。。。");
    }

    /**
     * arround
     * @param pjp
     */
    public void aroundPrintLog(ProceedingJoinPoint pjp) {
        try {
            System.out.println("前置 Logger 类中的 aroundPrintLog 方法开始记录日志了");
            pjp.proceed();//明确的方法调用
            System.out.println("后置 Logger 类中的 aroundPrintLog 方法开始记录日志了");
        } catch (Throwable e) {
            System.out.println("异常 Logger 类中的 aroundPrintLog 方法开始记录日志了");
            e.printStackTrace();
        }finally {
            System.out.println("最终 Logger 类中的 aroundPrintLog 方法开始记录日志了");
        } }
}
