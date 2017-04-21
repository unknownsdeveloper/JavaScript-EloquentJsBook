package unknowns.developer.ankit.javascript_eloquentjsbook;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter9 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter9);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("eloquentjavascript.pdf").defaultPage(153).load();
    }
}
