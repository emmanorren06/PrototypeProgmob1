package prototypeprogmob.com.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import prototypeprogmob.com.Model.DSN;
import prototypeprogmob.com.R;

public class DosenAdapter extends RecyclerView.Adapter<DosenAdapter.ViewHolder>{

    ArrayList<DSN> dsnArrayList;

    public DosenAdapter(ArrayList<DSN> dsnArrayList) {
        this.dsnArrayList = dsnArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_dosen,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(dsnArrayList.get(position).getNama());
        holder.txtNohp.setText(dsnArrayList.get(position).getNohp());
        holder.txtNpm.setText(dsnArrayList.get(position).getNpm());
    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (dsnArrayList != null) ?dsnArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNohp, txtNpm;

        public ViewHolder(View view){
            super(view);

            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
            txtNohp = view.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
