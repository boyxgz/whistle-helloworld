package com.mycomany.sample;

import com.surelution.whistle.core.Attribute;
import com.surelution.whistle.core.BaseAction;

public class HelloWhistleAction extends BaseAction {

	@Override
	public boolean accept() {
		return "hello".equals(getParam(Attribute.KEY_Content));
	}

	@Override
	public void execute() {
		put(new Attribute(Attribute.KEY_Content, "whistle"));
	}

}
