package prototypeprogmob.com.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import proteintracker.com.Model.MhsSI;
import proteintracker.com.R;

public class KRSAdapter extends RecyclerView.Adapter<MHSAdapter.ViewHolder> {

    private ArrayList<MhsSI> mhsSIArrayList;

    public KRSAdapter(ArrayList<MhsSI> mhsSIArrayList){
        this.mhsSIArrayList = mhsSIArrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhskelas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mhsSIArrayList.get(position).getNama());
        holder.txtNim.setText(mhsSIArrayList.get(position).getNim());
        holder.txtGender.setText(mhsSIArrayList.get(position).getGender());
        holder.txtHobby.setText(mhsSIArrayList.get(position).getHobby());
        holder.txtCita.setText(mhsSIArrayList.get(position).getCita());
        holder.txtMoto.setText(mhsSIArrayList.get(position).getMoto());
        holder.ImgMhs.setImageResource(mhsSIArrayList.get(position).getImgMhs());
    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (mhsSIArrayList != null) ?mhsSIArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtGender, txtHobby, txtCita, txtMoto;
         ImageView ImgMhs;

        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txtNama);
            txtNim = view.findViewById(R.id.txtNim);
            txtGender = view.findViewById(R.id.txtGender);
            txtHobby = view.findViewById(R.id.txtHobby);
            txtCita = view.findViewById(R.id.txtCita);
            txtMoto = view.findViewById(R.id.txtMoto);
            ImgMhs = view.findViewById(R.id.ImgMhs);
        }
    }


}
