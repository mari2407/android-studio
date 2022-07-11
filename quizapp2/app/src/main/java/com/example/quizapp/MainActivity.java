package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private TextView questiontv,questionnumbertv;
private Button option1btn,option2btn,option3btn,option4btn;
private ArrayList<quizmodel>quizmodelArrayList;
Random random;
int currentscore=0,questionAttempted=1,currentpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questiontv=findViewById(R.id.tvquestion);
        questionnumbertv=findViewById(R.id.tvquestionattempted);
        option1btn=findViewById(R.id.btnoption1);
        option2btn=findViewById(R.id.btnoption2);
        option3btn=findViewById(R.id.btnoption3);
        option4btn=findViewById(R.id.btnoption4);
        quizmodelArrayList=new ArrayList<>();
        random=new Random();
        getQuizQuestion(quizmodelArrayList);
        currentpos=random.nextInt(quizmodelArrayList.size());
        setDataToviews(currentpos);



        option1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option1btn.getText().toString().trim().toLowerCase())) ;
                currentscore++;
                questionAttempted++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDataToviews(currentpos);
            }

        });
        option2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option2btn.getText().toString().trim().toLowerCase())) ;
                currentscore++;
                questionAttempted++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDataToviews(currentpos);
            }
        });
option3btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option3btn.getText().toString().trim().toLowerCase())) ;
        currentscore++;
        questionAttempted++;
        currentpos=random.nextInt(quizmodelArrayList.size());
        setDataToviews(currentpos);
    }
});
option4btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option4btn.getText().toString().trim().toLowerCase())) ;
        currentscore++;
        questionAttempted++;
        currentpos=random.nextInt(quizmodelArrayList.size());
        setDataToviews(currentpos);
    }
});

    }
    private void showBottomsheet(){
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this);
        View bottomsheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idllscore));
        TextView scoreTV=bottomsheetview.findViewById(R.id.idTVscore);
        Button restartQuizbtn=bottomsheetview.findViewById(R.id.idbtnrestart);
        scoreTV.setText("your score is \n"+currentscore+"/10");
        restartQuizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDataToviews(currentpos);
                questionAttempted=1;
                currentscore=0;
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomsheetview);
        bottomSheetDialog.show();

    }
private void setDataToviews(int currentpos){
        questionnumbertv.setText("Question Attempted :"+questionAttempted+"/10");
if (questionAttempted==10){
    showBottomsheet();
}else {
    questiontv.setText(quizmodelArrayList.get(currentpos).getQuestion());
    option1btn.setText(quizmodelArrayList.get(currentpos).getOption1());
    option2btn.setText(quizmodelArrayList.get(currentpos).getOption2());
    option3btn.setText(quizmodelArrayList.get(currentpos).getOption3());
    option4btn.setText(quizmodelArrayList.get(currentpos).getOption4());
}



}
    private void getQuizQuestion(ArrayList<quizmodel>quizModelArrayList) {

        quizModelArrayList.add(new quizmodel("how GFG is used ?","to solve DSA problem","to learn new language","to learn android","All of the above","All of the above"));
        quizModelArrayList.add(new quizmodel("what is GCM in android ?","google cloud messaging","google message pack","google cloud manager","All of the above","google cloud messaging"));
        quizModelArrayList.add(new quizmodel("what is ADB in android ?","android debug bridge","android data bridge","android database bridge","All of the above","android debug bridge"));
        quizModelArrayList.add(new quizmodel("whare are color present in android ?","colors.xml","android manifests.xml","strings.xml","All of the above","colors.xml"));

    }
}