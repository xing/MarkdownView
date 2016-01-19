package us.feras.mdv.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import us.feras.mdv.MarkdownView;

public class RemoteMarkdownActivity extends AppCompatActivity {
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView markdownView = new MarkdownView(this); 
		setContentView(markdownView);
		markdownView.loadMarkdownFile("https://raw.githubusercontent.com/xing/markdown-view/master/README.md");
	}
}
