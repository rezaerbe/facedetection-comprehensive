package com.erbe.facedetection.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erbe.facedetection.Model.FaceDetection;
import com.erbe.facedetection.R;

import java.text.MessageFormat;
import java.util.List;

public class FaceDetectionAdapter extends RecyclerView.Adapter<FaceDetectionAdapter.ViewHolder> {

    private Context context;
    private List<FaceDetection> faceDetectionList;

    public FaceDetectionAdapter(Context context, List<FaceDetection> faceDetectionList) {
        this.context = context;
        this.faceDetectionList = faceDetectionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_face_detection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FaceDetection faceDetection = faceDetectionList.get(position);
        holder.text1.setText(MessageFormat.format("Face: {0}", String.valueOf(faceDetection.getId())));
        holder.text2.setText(MessageFormat.format("Face: {0}", faceDetection.getText()));
    }

    @Override
    public int getItemCount() {
        return faceDetectionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView text1, text2;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            text1 = itemView.findViewById(R.id.item_face_detection_text_view1);
            text2 = itemView.findViewById(R.id.item_face_detection_text_view2);
        }
    }
}
