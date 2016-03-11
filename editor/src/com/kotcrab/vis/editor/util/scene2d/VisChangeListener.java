/*
 * Copyright 2014-2016 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.util.scene2d;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

/**
 * Allow to use standard scene2d.ui {@link ChangeListener} with lambdas.
 * @author Kotcrab
 */
public class VisChangeListener extends ChangeListener {
	private ChangedListener listener;

	public VisChangeListener (ChangedListener listener) {
		this.listener = listener;
	}

	@Override
	public void changed (ChangeEvent event, Actor actor) {
		listener.changed(event, actor);
	}

	public interface ChangedListener {
		void changed (ChangeEvent event, Actor actor);
	}
}