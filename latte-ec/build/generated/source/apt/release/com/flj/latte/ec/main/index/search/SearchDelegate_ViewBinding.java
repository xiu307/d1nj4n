// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.index.search;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchDelegate_ViewBinding implements Unbinder {
  private SearchDelegate target;

  private View view2131558589;

  private View view2131558588;

  @UiThread
  public SearchDelegate_ViewBinding(final SearchDelegate target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_search, "field 'mRecyclerView'", RecyclerView.class);
    target.mSearchEdit = Utils.findRequiredViewAsType(source, R.id.et_search_view, "field 'mSearchEdit'", AppCompatEditText.class);
    view = Utils.findRequiredView(source, R.id.tv_top_search, "method 'onCliclSearch'");
    view2131558589 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCliclSearch();
      }
    });
    view = Utils.findRequiredView(source, R.id.icon_top_search_back, "method 'onClickBack'");
    view2131558588 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBack();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSearchEdit = null;

    view2131558589.setOnClickListener(null);
    view2131558589 = null;
    view2131558588.setOnClickListener(null);
    view2131558588 = null;
  }
}
