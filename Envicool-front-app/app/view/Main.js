Ext.define('Envicool.view.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'main',
    requires: [
        'Ext.TitleBar',
        'Ext.Video'
    ],
    config: {
        tabBarPosition: 'bottom',

        items: [
            {
                title: 'Welcome',
                iconCls: 'home',
                scrollable: false,
                layout:'fit',
                items:[ 
                    {
                        docked: 'top',
                        xtype: 'titlebar',
                        title: 'Welcome'
                    },
                    {
                        xtype: 'carousel',
                        bufferSize: 2,

                        //this time direction vertical
                        direction: 'vertical'
                    }
                ]
            },
            { iconCls: 'favorites', title: 'Favorites' },
            {
                title: 'Info',
                iconCls: 'info',

                items: [
                    {
                        docked: 'top',
                        xtype: 'titlebar',
                        title: 'Getting Started'
                    }
                ]
            },
            { iconCls: 'more',      title: 'More' }
        ]
    }
});