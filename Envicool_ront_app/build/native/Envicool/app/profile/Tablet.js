Ext.define('Envicool.profile.Tablet', {
    extend: 'Ext.app.Profile',
    
    //define any additional classes your Profile needs here
    config: {
        views: ['Main'],
        models: [],
        stores: [],
        controllers: []
    },
    
    //this profile will be activated if we detect we're running on a Tablet
    isActive: function(app) {
        return Ext.os.is.Tablet || Ext.os.is.Desktop;
    },
    launch:function(){
        Ext.create('Envicool.view.tablet.Main',{fullscreen: true});
    }
});