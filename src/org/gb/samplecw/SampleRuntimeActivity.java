// Copyright (c) 2013 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.gb.samplecw;

import org.xwalk.app.XWalkRuntimeActivityBase;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SampleRuntimeActivity extends XWalkRuntimeActivityBase {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void didTryLoadRuntimeView(View runtimeView) {
		if (runtimeView != null) {
			setContentView(runtimeView);
			getRuntimeView().loadAppFromManifest(
					"file:///android_asset/www/manifest.json");
		} else {
			TextView msgText = new TextView(this);
			msgText.setText("Crosswalk failed to initialize.");
			msgText.setTextSize(36);
			msgText.setTextColor(Color.BLACK);
			setContentView(msgText);
		}
	}
}
