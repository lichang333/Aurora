package com.zwh.mvparms.eyepetizer.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.zwh.mvparms.eyepetizer.di.module.AuthorDetailModule;
import com.zwh.mvparms.eyepetizer.mvp.ui.fragment.AuthorAlbumFragment;
import com.zwh.mvparms.eyepetizer.mvp.ui.fragment.AuthorVideoFragment;

import dagger.Component;

@ActivityScope
@Component(modules = AuthorDetailModule.class, dependencies = AppComponent.class)
public interface AuthorDetailAlbumComponent {
    void inject(AuthorAlbumFragment fragment);
}