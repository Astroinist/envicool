Ext.define('Envicool.controller.Main', {
    extend: 'Ext.app.Controller',
    
    config: {
        refs: {
             mainView:{
                selector: 'main',
                xtype: 'main',
                autoCreate: false
            }
        },
        control: {
            
        }
    },
    
    //called when the Application is launched, remove if not needed
    launch: function(app) {
        Ext.fly('appLoadingIndicator').destroy();

        // Initialize the main view
        Ext.Viewport.add(Ext.create('Envicool.view.Main'));

        var main = this.getMainView(),
            carousel = main.down('[iconCls=home] carousel'),
            items = [];

        for(var i=1;i<=10;i++){
            items.push({
                xtype:'container',
                layout:{
                    type:'vbox',
                    pack:'justify'
                },
                items:[{
                    flex:1,
                    xtype: 'image',
                    cls: 'my-carousel-item-img',
                    src: 'resources/photos/Cars/' + i + '.jpg'
                },
                {
                    flex:1,
                    xtype: 'container',
                    styleHtmlContent:true,
                    html:'搞一堆文字'
                }
                ]
            })
        }
        carousel.add(items);
    }
});
