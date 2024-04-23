package com.backend_scaffold;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class OptimusVisualApplicationTests {
	@Test
	public void testRegex(){
		String regex = "[\\u4e00-\\u9fff&&[^一]&&[^无]]";
		String text = "我是一，一二(一)三无一.一、一一一一一周后随访一无一一一一一一一，你好吗？";
		Matcher matcher = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS).matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
