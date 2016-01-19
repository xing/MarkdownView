package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MarkdownThemesActivity extends AppCompatActivity implements
		OnItemSelectedListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.markdown_themes);
		Spinner themesSpinner = (Spinner) findViewById(R.id.themes_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.md_themes, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		themesSpinner.setAdapter(adapter);
		themesSpinner.setSelection(0);
		themesSpinner.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		MarkdownView mdv = (MarkdownView) findViewById(R.id.markdownView);
		mdv.loadMarkdownFile("file:///android_asset/hello.md",
				"file:///android_asset/markdown_css_themes/"
						+ parent.getItemAtPosition(pos).toString() + ".css");
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// no-op
	}
}
