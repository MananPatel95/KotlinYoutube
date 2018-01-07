package mananpatel.com.youtubekotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by Manan on 1/7/2018.
 */

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    // Similar to UITableView number of items
    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class CustomViewHolder(v: View): RecyclerView.ViewHolder(v) {

}
