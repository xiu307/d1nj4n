// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.detail;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.diabin.latte.ec.R;
import com.flj.latte.ui.widget.CircleTextView;
import com.joanzapata.iconify.widget.IconTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoodsDetailDelegate_ViewBinding implements Unbinder {
  private GoodsDetailDelegate target;

  private View view2131558674;

  @UiThread
  public GoodsDetailDelegate_ViewBinding(final GoodsDetailDelegate target, View source) {
    this.target = target;

    View view;
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.goods_detail_toolbar, "field 'mToolbar'", Toolbar.class);
    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", TabLayout.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
    target.mBanner = Utils.findRequiredViewAsType(source, R.id.detail_banner, "field 'mBanner'", ConvenientBanner.class);
    target.mCollapsingToolbarLayout = Utils.findRequiredViewAsType(source, R.id.collapsing_toolbar_detail, "field 'mCollapsingToolbarLayout'", CollapsingToolbarLayout.class);
    target.mAppBar = Utils.findRequiredViewAsType(source, R.id.app_bar_detail, "field 'mAppBar'", AppBarLayout.class);
    target.mIconFavor = Utils.findRequiredViewAsType(source, R.id.icon_favor, "field 'mIconFavor'", IconTextView.class);
    target.mCircleTextView = Utils.findRequiredViewAsType(source, R.id.tv_shopping_cart_amount, "field 'mCircleTextView'", CircleTextView.class);
    view = Utils.findRequiredView(source, R.id.rl_add_shop_cart, "field 'mRlAddShopCart' and method 'onClickAddShopCart'");
    target.mRlAddShopCart = Utils.castView(view, R.id.rl_add_shop_cart, "field 'mRlAddShopCart'", RelativeLayout.class);
    view2131558674 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickAddShopCart();
      }
    });
    target.mIconShopCart = Utils.findRequiredViewAsType(source, R.id.icon_shop_cart, "field 'mIconShopCart'", IconTextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GoodsDetailDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.mTabLayout = null;
    target.mViewPager = null;
    target.mBanner = null;
    target.mCollapsingToolbarLayout = null;
    target.mAppBar = null;
    target.mIconFavor = null;
    target.mCircleTextView = null;
    target.mRlAddShopCart = null;
    target.mIconShopCart = null;

    view2131558674.setOnClickListener(null);
    view2131558674 = null;
  }
}
