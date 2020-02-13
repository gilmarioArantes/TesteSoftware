//protractor.conf.js

module.exports.config = {
	seleniumAddress: 'http://localhost:4444/wd/hub',
	capabilities: {
		'browserName':'chrome'
	},
	specs: ['specs/*.spec.js'],
	baseUrl: 'http://www.protractortest.org/' //url do projeto de testes.
};
