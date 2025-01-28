cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "cordova-plugin-email.EmailComposer",
      "file": "plugins/cordova-plugin-email/www/email_composer.js",
      "pluginId": "cordova-plugin-email",
      "clobbers": [
        "cordova.plugins.email",
        "plugin.email"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-email": "1.2.7"
  };
});