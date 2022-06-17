"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.HttpClientService = void 0;
var core_1 = require("@angular/core");
var HttpClientService = /** @class */ (function () {
    function HttpClientService(httpClient) {
        this.httpClient = httpClient;
    }
    HttpClientService.prototype.getUsers = function () {
        return this.httpClient.get('http://localhost:3000/gamego/usercontroller/getallusers');
    };
    HttpClientService.prototype.addUser = function (newUser) {
        return this.httpClient.post('http://localhost:3000/gamego/authcontroller//register', newUser);
    };
    HttpClientService.prototype.addGame = function (newGame) {
        return this.httpClient.post('http://localhost:3000/gamego/productcontroller/insertProductConsole', newGame);
    };
    HttpClientService = __decorate([
        (0, core_1.Injectable)({
            providedIn: 'root'
        })
    ], HttpClientService);
    return HttpClientService;
}());
exports.HttpClientService = HttpClientService;
