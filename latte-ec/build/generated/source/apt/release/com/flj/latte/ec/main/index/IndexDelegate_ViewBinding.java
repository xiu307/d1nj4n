// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.index;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import com.joanzapata.iconify.widget.IconTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class IndexDelegate_ViewBinding implements Unbinder {
  private IndexDelegate target;

  private View view2131558563;

  @UiThread
  public IndexDelegate_ViewBinding(final IndexDelegate target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_index, "field 'mRecyclerView'", RecyclerView.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.srl_index, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.tb_index, "field 'mToolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.icon_index_scan, "field 'mIconScan' and method 'onClickScanQrCode'");
    target.mIconScan = Utils.castView(view, R.id.icon_index_scan, "field 'mIconScan'", IconTextView.class);
    view2131558563 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickScanQrCode();
      }
    });
    target.mSearchView = Utils.findRequiredViewAsType(source, R.id.et_search_view, "field 'mSearchView'", AppCompatEditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    IndexDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mRefreshLayout = null;
    target.mToolbar = null;
    target.mIconScan = null;
    target.mSearchView = null;

    view2131558563.setOnClickListener(null);
    view2131558563 = null;
  }
}
