package unknowns.developer.ankit.javascript_eloquentjsbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter1 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("eloquentjavascript.pdf").defaultPage(0).load();
    }
}
