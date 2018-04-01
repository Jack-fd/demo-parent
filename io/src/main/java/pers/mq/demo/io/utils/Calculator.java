package pers.mq.demo.io.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 表达式计算
 */
public class Calculator {

    private final static ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");

    public static Object evel(String expression) throws ScriptException {
        return scriptEngine.eval(expression);
    }
}
