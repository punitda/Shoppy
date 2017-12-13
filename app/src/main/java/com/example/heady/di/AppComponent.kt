package com.example.heady.di

import android.app.Application
import com.example.heady.ShoppyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by punitdama on 12/12/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class,
        RepositoryModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<ShoppyApplication> {

    @Component.Builder
    interface Builder{
        fun build() : AppComponent

        @BindsInstance
        fun application(app: Application) : AppComponent.Builder
    }
}