package com.devonfw.cobigen.pythonplugin;

import com.devonfw.cobigen.api.extension.InputReader;
import com.devonfw.cobigen.api.extension.MatcherInterpreter;
import com.devonfw.cobigen.api.extension.TriggerInterpreter;
import com.devonfw.cobigen.pythonplugin.inputreader.PythonInputReader;
import com.devonfw.cobigen.pythonplugin.matcher.PythonMatcher;

/**
 * {@link TriggerInterpreter} implementation of a Swagger Interpreter
 */
public class PythonTriggerInterpreter implements TriggerInterpreter {

    /**
     * {@link TriggerInterpreter} type to be registered
     */
    public String type;

    /**
     * Creates a new Swagger Interpreter
     * @param type
     *            to be registered
     */
    public PythonTriggerInterpreter(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public InputReader getInputReader() {
        return new PythonInputReader();
    }

    @Override
    public MatcherInterpreter getMatcher() {
        return new PythonMatcher();
    }

}
