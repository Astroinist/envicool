Ext.define('Envicool.profile.Phone', {
    extend: 'Ext.app.Profile',
    
    //define any additional classes your Profile needs here
    config: {
        views: ['Main'],
        models: [],
        stores: [],
        controllers: ['Main']
    },
    
    //this profile will be activated if we detect we're running on a Phone
    isActive: function(app) {
        return !Ext.os.is.Tablet && !Ext.os.is.Desktop;
    },
    launch:function(){
     Ext.create('Envicool.view.phone.Main',{fullscreen: true});
    }

});