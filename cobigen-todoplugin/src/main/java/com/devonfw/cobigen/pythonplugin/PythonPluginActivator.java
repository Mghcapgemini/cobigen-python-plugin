package com.devonfw.cobigen.pythonplugin;

import java.util.List;

import com.devonfw.cobigen.api.extension.GeneratorPluginActivator;
import com.devonfw.cobigen.api.extension.Merger;
import com.devonfw.cobigen.api.extension.TriggerInterpreter;
import com.devonfw.cobigen.pythonplugin.merger.PythonMerger;
import com.google.common.collect.Lists;

/**
 * Todo Plug-in Activator to be registered in the PluginRegistry of CobiGen.
 */
public class PythonPluginActivator implements GeneratorPluginActivator {
    
    /**
     * Defines the trigger type
     */
    private static final String TRIGGER_TYPE = "python";

    @Override
    public List<Merger> bindMerger() {
        List<Merger> merger = Lists.newLinkedList();
        merger.add(new PythonMerger("pythonmerge", false));
        merger.add(new PythonMerger("pythonmerge_override", true));
        return merger;
    }

    @Override
    public List<TriggerInterpreter> bindTriggerInterpreter() {
        return Lists.<TriggerInterpreter> newArrayList(new PythonTriggerInterpreter(TRIGGER_TYPE));
    }

}
