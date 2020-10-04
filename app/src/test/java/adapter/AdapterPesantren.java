package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dwiromadon.puskes.R;
import com.dwiromadon.puskes.model.ModelPuskesAdmin;
import com.dwiromadon.puskes.server.BaseURL;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterPesantren extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<ModelPuskesAdmin> item;

    public AdapterPesantren(Activity activity, List<ModelPuskesAdmin> item) {
        this.activity = activity;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.content_pet_admin, null);


        TextView namaPetshop = (TextView) convertView.findViewById(R.id.txtNamaPetshop);
        ImageView gambar     = (ImageView) convertView.findViewById(R.id.gambarPetshop);
        TextView notelp      = (TextView) convertView.findViewById(R.id.txtNoTelp);
        TextView alamat      = (TextView) convertView.findViewById(R.id.txtAlamat);
        namaPetshop.setText(item.get(position).getNamaPuskes());
        notelp.setText(item.get(position).getNotelp());
        alamat.setText(item.get(position).getAlamat());
        Picasso.get().load(BaseURL.baseUrl + "gambar/" + item.get(position).getGambar())
                .resize(40, 40)
                .centerCrop()
                .into(gambar);
        return convertView;
    }
}
