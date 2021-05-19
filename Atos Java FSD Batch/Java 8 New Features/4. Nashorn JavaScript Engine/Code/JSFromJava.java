package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSFromJava {

	public static void main(String[] args) {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		String script = "var welcome = 'Hello,';" + "welcome += ' Stephen';" + "welcome;";

//		Object result;
		String result;

		try {
//			result = engine.eval(script);
			result = (String) engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a javascript error.");
			e.printStackTrace();
		}

	}

}
