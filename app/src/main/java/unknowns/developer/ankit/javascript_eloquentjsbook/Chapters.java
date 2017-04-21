package unknowns.developer.ankit.javascript_eloquentjsbook;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Chapters extends AppCompatActivity {

    private List<Chapter> chapterList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChaptersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ChaptersAdapter(chapterList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Chapter chapter = chapterList.get(position);
                String intentClassName= StringUtils.deleteWhitespace(chapter.getNumber())+"";
                switch(intentClassName){
                    case "Chapter1":
                        Intent intent1=new Intent(Chapters.this,Chapter1.class);
                        startActivity(intent1);
                        break;
                    case "Chapter2":
                        Intent intent2=new Intent(Chapters.this,Chapter2.class);
                        startActivity(intent2);
                        break;
                    case "Chapter3":
                        Intent intent3=new Intent(Chapters.this,Chapter3.class);
                        startActivity(intent3);
                        break;
                    case "Chapter4":
                        Intent intent4=new Intent(Chapters.this,Chapter4.class);
                        startActivity(intent4);
                        break;
                    case "Chapter5":
                        Intent intent5=new Intent(Chapters.this,Chapter5.class);
                        startActivity(intent5);
                        break;
                    case "Chapter6":
                        Intent intent6=new Intent(Chapters.this,Chapter6.class);
                        startActivity(intent6);
                        break;
                    case "Chapter7":
                        Intent intent7=new Intent(Chapters.this,Chapter7.class);
                        startActivity(intent7);
                        break;
                    case "Chapter8":
                        Intent intent8=new Intent(Chapters.this,Chapter8.class);
                        startActivity(intent8);
                        break;
                    case "Chapter9":
                        Intent intent9=new Intent(Chapters.this,Chapter9.class);
                        startActivity(intent9);
                        break;
                    case "Chapter10":
                        Intent intent10=new Intent(Chapters.this,Chapter10.class);
                        startActivity(intent10);
                        break;
                    case "Chapter11":
                        Intent intent11=new Intent(Chapters.this,Chapter11.class);
                        startActivity(intent11);
                        break;
                    case "Chapter12":
                        Intent intent12=new Intent(Chapters.this,Chapter12.class);
                        startActivity(intent12);
                        break;
                    case "Chapter13":
                        Intent intent13=new Intent(Chapters.this,Chapter13.class);
                        startActivity(intent13);
                        break;
                    case "Chapter14":
                        Intent intent14=new Intent(Chapters.this,Chapter14.class);
                        startActivity(intent14);
                        break;
                    case "Chapter15":
                        Intent intent15=new Intent(Chapters.this,Chapter15.class);
                        startActivity(intent15);
                        break;
                    case "Chapter16":
                        Intent intent16=new Intent(Chapters.this,Chapter16.class);
                        startActivity(intent16);
                        break;
                    case "Chapter17":
                        Intent intent17=new Intent(Chapters.this,Chapter17.class);
                        startActivity(intent17);
                        break;
                    case "Chapter18":
                        Intent intent18=new Intent(Chapters.this,Chapter18.class);
                        startActivity(intent18);
                        break;
                    case "Chapter19":
                        Intent intent19=new Intent(Chapters.this,Chapter19.class);
                        startActivity(intent19);
                        break;
                    case "Chapter20":
                        Intent intent20=new Intent(Chapters.this,Chapter20.class);
                        startActivity(intent20);
                        break;
                    case "Chapter21":
                        Intent intent21=new Intent(Chapters.this,Chapter21.class);
                        startActivity(intent21);
                        break;

                }

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        prepareChapterData();

    }
    private void prepareChapterData() {
        Chapter chapter = new Chapter("Chapter 1", "Values, Types, and Operators");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 2", "Program Structure");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 3", "Functions");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 4", "Data Structures: Objects and Arrays");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 5", "Higher-Order Functions");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 6", "The Secret Life of Objects");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 7", "Project: Electronic Life");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 8", "Bugs and Error Handling");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 9", "Regular Expressions");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 10", "Modules");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 11", "Project: A Programming Language");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 12", "JavaScript and the Browser");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 13", "The Document Object Model");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 14", "Handling Events");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 15", "Project: A Platform Game");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 16", "Drawing on Canvas");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 17", "HTTP");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 18", "Forms and Form Fields");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 19", "Project: A Paint Program");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 20", "Node.js");
        chapterList.add(chapter);

        chapter = new Chapter("Chapter 21", "Project: Skill-Sharing Website");
        chapterList.add(chapter);

    }
}
