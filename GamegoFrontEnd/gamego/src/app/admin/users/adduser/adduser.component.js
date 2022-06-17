"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.AdduserComponent = void 0;
var core_1 = require("@angular/core");
var AdduserComponent = /** @class */ (function () {
    function AdduserComponent(httpClientService, router) {
        this.httpClientService = httpClientService;
        this.router = router;
        this.userAddedEvent = new core_1.EventEmitter();
    }
    AdduserComponent.prototype.ngOnInit = function () {
    };
    AdduserComponent.prototype.addUser = function () {
        var _this = this;
        this.httpClientService.addUser(this.user).subscribe(function (user) {
            _this.userAddedEvent.emit();
            _this.router.navigate(['admin', 'users']);
        });
    };
    __decorate([
        (0, core_1.Input)()
    ], AdduserComponent.prototype, "user");
    __decorate([
        (0, core_1.Output)()
    ], AdduserComponent.prototype, "userAddedEvent");
    AdduserComponent = __decorate([
        (0, core_1.Component)({
            selector: 'app-adduser',
            templateUrl: './adduser.component.html',
            styleUrls: ['./adduser.component.css']
        })
    ], AdduserComponent);
    return AdduserComponent;
}());
exports.AdduserComponent = AdduserComponent;
