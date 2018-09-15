package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView questionTextView;
    private Button topButton;
    private Button bottomButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        questionTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //First CLick
                if (mStoryIndex==1){
                    questionTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex==2){ //index 2 with yes button
                    questionTextView.setText(R.string.T6_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);

                }else if (mStoryIndex==3){
                    questionTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex =4;
                }else if (mStoryIndex==4){
                    questionTextView.setText(R.string.T6_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);
                }


            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //First CLick
                if (mStoryIndex==1){
                    questionTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 3;
                }else if (mStoryIndex==2) { //index 2 with yes button
                    questionTextView.setText(R.string.T5_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);
                }else if (mStoryIndex==3){
                    questionTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }else if (mStoryIndex==4){
                    questionTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                }


            }
        });


    }
}
