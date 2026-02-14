module com.github.david32768.JynxMacroLibrary {
	requires com.github.david32768.JynxFor;
	requires com.github.david32768.JynxFree;
        exports com.github.david32768.jynxmacrolibrary;
        exports com.github.david32768.jynxmacrolibrary.ops;
	provides com.github.david32768.jynxfor.ops.MacroLib with
		com.github.david32768.jynxmacrolibrary.StructuredMacroLib,
		com.github.david32768.jynxmacrolibrary.ASMTextMacroLib,
		com.github.david32768.jynxmacrolibrary.ExtensionMacroLib;
}
