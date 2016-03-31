package com.brettnapier.quiz3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class QuestionFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View vw = inflater.inflate(R.layout.question_fragment, container, false);

        final TextView question = (TextView) vw.findViewById(R.id.textView_question);

        return vw;

    }
}
