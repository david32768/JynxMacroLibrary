package com.github.david32768.jynxmacrolibrary;

import java.util.HashMap;
import java.util.Map;

import com.github.david32768.jynxfor.ops.JynxOp;
import com.github.david32768.jynxfor.ops.MacroLib;
import com.github.david32768.jynxfor.ops.SelectOps;

import com.github.david32768.jynxmacrolibrary.ops.ExtendedOps;
import com.github.david32768.jynxmacrolibrary.ops.JavaCallOps;

public class ExtensionMacroLib extends MacroLib {
            
    private final static String NAME = "extension";
        
    @Override
    public Map<String,JynxOp> getMacros() {
        Map<String,JynxOp> map = new HashMap<>();
        map.putAll(JavaCallOps.getMacros());
        map.putAll(ExtendedOps.getMacros());
        map.putAll(SelectOps.getMacros());
        return map;
    }
    
    @Override
    public String name() {
        return NAME;
    }

}
